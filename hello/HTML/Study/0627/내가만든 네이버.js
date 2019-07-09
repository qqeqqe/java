$(document).ready(function(){
	$('.auto-search').click(function(){
		$(this).find('.icon-auto-down').toggleClass('icon-auto-up');
		//검색창에 녹색 밑줄을 토글(제거했다 추가)하는 코드
		$('.search-input-box').toggleClass('border-bottom-none');
		$('.auto-box').slideToggle(10);
	});
	$('.realtime-search').mouseenter(function(){
		$('.realtime-search-box').addClass('display-block')
	})
	$('.realtime-search-box').mouseout(function(){
		$(this).removeClass('display-block')
	})

	
	 function ticker(selector, height){
    setTimeout(function(){
	 		$(selector +' li:first').animate( {marginTop: '-' + height}, 400, 
				function(){$(this).detach().appendTo(selector +' ul').removeAttr('style');
			});
					ticker(selector, height);  
	 			}, 1000);
     	};
		 ticker('.realtime-search','20px'); 
		 ticker('.newsChannel','20px'); 
			 })


			
					 
			 



	/* 	
	function ticker(){   // 1초후에 f1 함수를 호출한다.
		setTimeout(f1, 1000)
		};

		function f1(){  // 첫번쨰 li태그를 0.4초동안 위로 20ox올린후 f2를 실행
			$('.realtime-search li:first').animate( {marginTop: '-20px'}, 400, f2);
			ticker();
		}

		function f2(){  // 맨위에 있는 li태그를 잘라서 ul태그 끝에 붙이는 함수
			$(this)
			.detach()   // 잘라내기 속성을 가진 함수
			.appendTo('.realtime-search ul')
			.removeAttr('style');
		}
		ticker(); 
		*/
