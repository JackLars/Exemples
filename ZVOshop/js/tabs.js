(function($) {
    $(function() {

        $('ul.tabs-caption').on('click', 'li:not(.active)', function() {
            $(this)
                .addClass('active').siblings().removeClass('active')
                .closest('div.tabs').find('div.tabs-content').removeClass('active').eq($(this).index()).addClass('active');
        });

    });
})(jQuery);

(function($) {
    $(function() {

        $('ul.radio-tabs-caption').on('click', 'li:not(.active)', function() {
            $(this)
                .addClass('active').siblings().removeClass('active')
                .closest('div.radio-tabs').find('ul.radio-tabs-content').removeClass('active').eq($(this).index()).addClass('active')
                .closest('div.radio-tabs').find('input.address').toggle('input-show')
                .closest('div.radio-tabs').find('div.payment-method').toggleClass('payment-method-show');
        });

    });
})(jQuery);

(function($) {
    $(function() {

        $('ul.radio-tabs-caption1').on('click', 'li:not(.active)', function() {
            $(this)
                .addClass('active').siblings().removeClass('active');
        });

    });
})(jQuery);