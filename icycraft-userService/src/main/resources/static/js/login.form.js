$(function() {

	"use strict";

	$('.login-form').on("submit", function(){
		var $this = $(this);
						   
		$('.invalid').removeClass('invalid');						   
		var msg = '你好像有东西没有填',
			successMessage = ",欢迎加入冰笑风云！ <a href='#'>去登录</a>",
			error = 0,
			pattern = new RegExp(/^(("[\w-\s]+")|([\w-]+(?:\.[\w-]+)*)|("[\w-\s]+")([\w-]+(?:\.[\w-]+)*))(@((?:[\w-]+\.)*\w[\w-]{0,66})\.([a-z]{2,6}(?:\.[a-z]{2})?)$)|(@\[?((25[0-5]\.|2[0-4][0-9]\.|1[0-9]{2}\.|[0-9]{1,2}\.))((25[0-5]|2[0-4][0-9]|1[0-9]{2}|[0-9]{1,2})\.){2}(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[0-9]{1,2})\]?$)/i);


		if ($.trim($('.login-form input[name="name"]').val()) === '') {error = 1; $this.find('input[name="name"]').parent().addClass('invalid'); msg = msg +  '\n - 名字';}
        if (!pattern.test($.trim($('.login-form input[name="email"]').val()))) {error = 1; $this.find('input[name="email"]').parent().addClass('invalid'); msg = msg +  '\n - 而且邮箱格式也不对呀';}		
		if ($.trim($('.login-form input[name="userName"]').val()) === '') {error = 1; $this.find('input[name="userName"]').parent().addClass('invalid'); msg = msg +  '\n - 用户名';}
		if ($.trim($('.login-form input[name="passWord"]').val()) === '') {error = 1; $this.find('input[name="passWord"]').parent().addClass('invalid'); msg = msg +  '\n - 密码';}
        if (error){
        	updateTextPopup('ERROR', msg);
        }else{
            var url = '/register',
            	name = $.trim($this.find('input[name="name"]').val()),
            	email = $.trim($this.find('input[name="email"]').val()),
            	userName = ($this.find('input[name="userName"]').length)?$.trim($this.find('input[name="userName"]').val()):'',
            	passWord = $.trim($this.find('input[name="passWord"]').val());

            $.post(url,{'name':name,'email':email,'userName':userName,'passWord':passWord},function(data){
            	updateTextPopup('THANK YOU!',name+successMessage);
	        	$this.append('<input type="reset" class="reset-button"/>');
	        	$('.reset-button').click().remove();
	        	$this.find('.focus').removeClass('focus');
			});
        }
	  	return false;
	});

	$(document).on('keyup', '.input-wrapper .input', function(){
		$(this).parent().removeClass('invalid');
	});

	function updateTextPopup(title, text){
		$('.text-popup .text-popup-title').text(title);
		$('.text-popup .text-popup-message').text(text);
		$('.text-popup').addClass('active');
	}

});
