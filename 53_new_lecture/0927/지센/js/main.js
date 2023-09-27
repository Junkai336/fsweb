$(function () {

    var status;

    function removeClassFn () {  
        $(".mobile_nav").removeClass("active");
        $(".transparency").removeClass("active");
        $(".container").removeClass("active");
        $(".mobile_nav .sub").hide();
    };

    $(window).resize(function () {
        var w = $(this).width(); // 화면의 가로사이즈를 w에 대입

        if (w <= 850) {
            status = "mobile";
        } else {
            status = "pc";
            if ($('.mobile_nav').hasClass('active') == true) {
                removeClassFn();
                // $(".mobile_nav").removeClass("active");
                // $(".transparency").removeClass("active");
                // $(".container").removeClass("active");
                // $(".mobile_nav .sub").hide();
            }
        }
        
    });
    
    $(".mobile_tab").click(function () {
        $(".mobile_nav").addClass("active");
        $(".transparency").addClass("active");
        $(".container").addClass("active");
    });
    
    $(".transparency").click(function () {
        removeClassFn();
        // $(".mobile_nav").removeClass("active");
        // $(".transparency").removeClass("active");
        // $(".container").removeClass("active");
        // $(".mobile_nav .sub").hide();
    });

    $(".mobile_nav > ul > li > a").click(function () {
        if ($(this).next('.sub').css('display') == 'none') {
            $(".mobile_nav .sub").slideUp(300);
            $(this).next('.sub').slideDown(300);
        } else {
            $(this).next('.sub').slideUp(300);
        }
        return false;
    });

    $(".nav > ul").hover(function (){
        $(this).toggleClass("over");
    });



});