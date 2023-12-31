package jpabook.jpashob.service;

import jpabook.jpashob.domain.*;
import jpabook.jpashob.domain.item.Item;
import jpabook.jpashob.repository.ItemRepository;
import jpabook.jpashob.repository.MemberRepository;
import jpabook.jpashob.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class OrderService {
    private final MemberRepository memberRepository;
    private final OrderRepository orderRepository;
    private final ItemRepository itemRepository;

    /**주문**/
    @Transactional
    public Long order(Long memberId, Long itemId ,int count){

        //엔티티조회
        Member member = memberRepository.findOne(memberId);
        Item item = itemRepository.findOne(itemId);

        //배송정보 생성
        Delivery delivery = new Delivery();
        delivery.setAddress(member.getAddress());
        delivery.setStatus(DeliveryStatus.READY);
        //상품생성
        OrderItem orderItem = OrderItem.createOrderItem(item, item.getPrice(),count);
        //주문생성
        Order order = Order.createOrder(member, delivery,orderItem );

        //주문저장
        orderRepository.save(order);
        return order.getId();
    }

    //주문취소
    @Transactional
    public void cancelOrder(Long orderId){
        //주문 엔티티 조회
        Order order = orderRepository.findOne(orderId);
        //주문 취소
        order.cancel();
    }






}
