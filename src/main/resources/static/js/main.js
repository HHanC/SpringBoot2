alert("js테스트");
// ajax 사용할려면
$.ajax({
    url: "getdata",
    success: function(re){
       alert("통신확인 : " + re );
       $("#divbox").html(re);
    }
});
