$(function(){
    $('.drop-down').on('click', function(e){
        e.preventDefault();
        $(this).parent().toggleClass('is-active');
    });
});