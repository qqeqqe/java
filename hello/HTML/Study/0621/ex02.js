$(document).ready(function(){
		
	$('#pw1').change(function(){
			if(!checkLength('#pw1',8,13)){
			 alert('올바른 값을 입력하세요');
			}

			
		});


	 $('#pw2').change(function(){
		if(!equals('#pw1', '#pw2')){
		alert('비번이 같지 않습니다.')
	 	}		
	});

	});



	function checkLength(selector,min,max){
		
		// var length = $('#'+id).val().length;    // 여기서 #을 넣는 이유는 매개변수에 원하는 값을 #id로 받아야 하기때문이다.
		var length = $(selector).val().length;  //selector 로 할경우 좀더 재사용성이 높다.

		if(length > max || length < min)
			return false;
		else
			return true;
	}



	function equals(sel1, sel2){
		if($(sel1).val() == $(sel2).val())
		return true;
		return false;
	}