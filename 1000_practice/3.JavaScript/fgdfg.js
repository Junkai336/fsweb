var userEmail = `[[${userEmail}]]`;
console.log("수정 요청자의 email :" + userEmail);
// 댓글 수정/삭제 div List
var commentBtnList = document.querySelectorAll(".commentBtnBox");
// 댓글 작성자 emailList
var editorEmailList = document.querySelectorAll(".editorEmail");
for (let k = 0; k < editorEmailList.length; k++) {
  if (userEmail != editorEmailList[k].value) {
    commentBtnList[k].style.display = "none";
  }
}

// =============================댓글 수정==========================================

// 게시글 id = > edit-articleDto-id



// 수정 버튼 class :"editBtn"
// 기존 댓글의 id class :comment-id
// 기존 댓글 comment => class :commentContent

// 수정 시 출력할 댓글 수정 창 class : commentEditForm
// 수정 form의 입력 창 class: editedComment

//  수정 버튼 클릭시 기존 작성된 댓글() hide
// 수정할 댓글 입력 input show

// 현재 보고있는 게시글의 id값
var article_id = document.querySelector("#edit-articleDto-id").value;
// 수정 버튼 List
var editBtnList = document.querySelectorAll(".editBtn");
// 기존 댓글 id List
var comment_idList = document.querySelectorAll(".comment-id");
// 기존 댓글 commentList
var commentList = document.querySelectorAll(".commentContent");

// 수정버튼을 클릭하면 없어질 댓글 내용
var editCommentList = document.querySelectorAll("#editComment");
// 수정버튼을 클릭하면 없어질 댓글 박스
var editCommentBoxList = document.querySelectorAll("#editCommentBox");

// 수정시 출력할 댓글 수정 창List
var commentEditFormList = document.querySelectorAll(".commentEditForm");
// 댓글수정 취소버튼
var editCloseBtnList = document.querySelectorAll("#closeBtn");

// 수정시 from 내부 input List
var editCommentInputList = document.querySelectorAll(".editCommentInput");
// 수정 요청 시 들고 나갈 comment_id 창
var postComment_idList = document.querySelectorAll(".postComment_id");

//================================================
for (let i = 0; i < editCloseBtnList.length; i++) {
  editCloseBtnList[i].addEventListener("click", () => {
    window.location.reload();
  });
}
//================================================

let comment_id; // 수정할 댓글의 id
let comment;  // 기존 댓글의 내용
let commentEditForm; // 수정할 댓글의 form
let editCommentInput; // 수정 댓글을 담을 input
let postComment_id;
let editorEmail;
for (let i = 0; i < editBtnList.length; i++) {
  editBtnList[i].addEventListener("click", () => {
    console.log(i);
    comment_id = comment_idList[i];
    console.log(comment_idList[i]);
    comment = commentList[i];
    console.log(comment.value);
    commentEditForm = commentEditFormList[i];
    editCommentInput = editCommentInputList[i];
    editCommentInput.value = comment.value;
    // 수정버튼을 누르면 원래있던 댓글 내용이 사라지고 인풋창이 나타남
    editCommentList[i].classList.add('hide');
    editCommentBoxList[i].style.minWidth = "80px";

    editorEmail = editorEmailList[i].value;
    // 수정 요청을 하는 사용자가 댓글작성자와 같은지 식별
    if (editorEmail == userEmail) {
      // 조건 충족시 댓글 수정창을 보여줌
      comment.classList.toggle("hide");
      commentEditForm.classList.toggle("hide");
      editBtnList[i].classList.toggle("hide");
    } else {
      // 조건 불충족시 권한없음을 알림
      alert("권한이 없습니다.");
    }
    console.log("editorEmail : " + editorEmail);
    console.log("comment_id:" + comment_id.value);
    console.log("comment:" + comment.value);


    commentEditForm.addEventListener("submit", (e) => {

      e.preventDefault();
      const articleId = article_id;
      const commentId = comment_id.value;

      const editComment = editCommentInput.value;
      editCommentCount = editComment.replaceAll(" ", "");
      if (editCommentCount.length != 0) {

        console.log("comment_id : " + commentId);
        console.log("editComment : " + editComment);

        const postComment = {
          id: commentId,
          comment: editComment
        };

        //수정 Rest APi 호출 - fetch()
        //주의 method : "post"

        var token = $("meta[name='_csrf']").attr("content");
        var header = $("meta[name='_csrf_header']").attr("content");

        // 넘길 데이터 json 형식
        var paramData = JSON.stringify(postComment);

        console.log(paramData);

        // URL
        const url = `/article/${articleId}/commentEdit/${commentId}`;
        console.log(url);

        $.ajax({
          url: url,
          type: "POST",
          contentType: "application/json",
          data: paramData,
          beforeSend: function (xhr) {
            /* 데이터를 전송하기 전에 헤더에 csrf값을 설정 */
            xhr.setRequestHeader(header, token);
          },
          dataType: "json",
          cache: false,
          success: function (status) {
            alert("댓글수정 잘됨");
          }, error: function (status) {
            alert("안넘어감 ;;")
          }

        });
      }
      });
  });

}