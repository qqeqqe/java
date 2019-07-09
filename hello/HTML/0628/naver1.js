$(document).ready(function(){

	$('.auto-search').click(function(){
		$(this).find('.icon-auto-down').toggleClass('icon-auto-up');
		//검색창에 녹색 밑줄을 토글(제거했다 추가)하는 코드
		$('.search-input-box').toggleClass('border-bottom-none');
		$('.auto-box').slideToggle(10);
	});

	$('.realtime-search').mouseenter(function(){
		$('.realtime-search-box').addClass('display-block');
	})
	$('.realtime-search-box').mouseout(function(){
		$(this).removeClass('display-block');
	})



/*	function ticker(){
		//1초후에 f1함수를 실행해라
		setTimeout(f1, 1000);
	};
	function f1(){
		//첫번째 li태그를 0.4초동안 위로 20px올린 후 f2를 실행
		$('.realtime-search li:first')
			.animate( {marginTop: '-20px'}, 400, f2);
		//ticker()함수처럼 보이지만 일반 재귀함수랑 형태가 다르다.
		ticker();
	}

	//맨위에 있는 li태그를 잘라서 ul태그 끝에 붙이는 함수
	function f2(){
		$(this)//li태그 첫번째 요소 : $('.realtime-search li:first')
			.detach()//떼서  
			.appendTo('.realtime-search ul')//ul태그 뒤에 
			.removeAttr('style');//style="margin-top:-20px"를 제거
	}
	ticker();//ticker함수 실행
	*/
	//A.append(B);//A요소 자손들 끝에 B를 추가해라
	//A.appendTo(B);//A요소를 B자손 끝에 추가해라



	function ticker(selector,height){
		setTimeout(function(){
			$(selector+' li:first')
				.animate( {marginTop: '-'+height}, 400, function(){
					$(this)
						.detach()
						.appendTo(selector+' ul')
						.removeAttr('style');
      });
			ticker(selector,height);
		}, 1000);
	};
	ticker('.realtime-search','20px');
	ticker('.news-ticker','20px');
	$('.r2-top-btn.next').click(function(){
		var num = $('#num').text();
		num++;
		if(num==7) num = 1;
		$('#num').text(num);
	})
	$('.r2-top-btn.prev').click(function(){
		var num = $('#num').text();
		num--;
		if(num==0) num = 6;
		$('#num').text(num);
	})




	// $('.l3-item').mouseenter(function(){
	// 	var boxin = '<div class="div-centerBox"><div>'
	
	// 	$(this).html(boxin)
	// 		// $(this).addClass('div-centerBox')
	// 			});
	
	// 	$('.l3-item').mouseleave(function(){
	// 		var boxOut = '';
	// 		$(this).html(boxOut);
	// 		$(this).addClass('l3-item')
	// 		 })

		// $('.l3-item').mouseenter(function(){
		// 	var boxin = '<div class="div-centerBox"><div>'
			
		// $(this).html(boxin)
		// 	// $(this).addClass('div-centerBox')
		// 	});
			
		// $('.l3-item').mouseleave(function(){
		// 	var boxOut = '';
		// 	$(this).html(boxOut);
		// 	$(this).addClass('l3-item')
		// 	 })

		// $('.').mouseenter(function(){
		// 	$('.').addClass('');
		// })
		// $('.').mouseout(function(){
		// 	$(this).removeClass('');
		// })


		// $('.l3-item').hover(function() {
		// 	$(this).addClass('div-centerBox');
		// });
		
		// $('.l3-item').mouseleave(function(){
		// 	$(this).removeClass('div-centerBox');
		// });

	


/* 더보기 버튼 눌렀을대 이벤트 */
		$('.banner-img').click(function(){
			$('.dropBoxMenu1').toggleClass('display-none1');  //위에 하얀화면
			$('.dropBoxMenu2').toggleClass('display-none1');  //아래 검은화면
			$('.ss_btns').toggleClass('display-none1');   //서비스화면 + 메뉴설정 덮고 있는 div
			
			$('.ss_btn_setting').toggleClass('display-none1');  //메뉴설정
			$('.realtime-search').addClass('display-none1');  //검색창
			
			$('.ssCheck').addClass('display-none1');  // 체크박스

			$('.ss_btn_svcall').removeClass('display-none1');   //서비스전체보기
			$('.ss_btn_setting').removeClass('display-none1');  //메뉴설정

			$('.ss_btn_reset').addClass('display-none1');   //초기화 초기값 none
			$('.ss_btn_confirm').addClass('display-none1'); //확인 초기값 none
			$('.ss_btn_cancel').addClass('display-none1');  //취소 초기값 none
			
			$('.ss_btn_close').removeClass('display-none1');      // close X 버튼
			$(this).toggleClass('an_mtxt')  // 더보기 눌렀을대 접기이미지 표기
		})
		
		

		/* 메뉴 설정 눌렀을대 이벤트 */
		$('.ss_btn_setting').click(function(){
			$('.ssCheck').toggleClass('display-none1');         //체크박스
			
			 $('.ss_btn_svcall').addClass('display-none1');   //서비스전체보기
			 $('.ss_btn_setting').addClass('display-none1');  //메뉴설정

			$('.ss_btn_reset').toggleClass('display-none1');    //초기화 초기값 none
			$('.ss_btn_confirm').toggleClass('display-none1');  //확인 초기값 none
			$('.ss_btn_cancel').toggleClass('display-none1');   //취소 초기값 none
		})
		 
		

		/* 취소버튼 버튼을 눌렀을대 이벤트 */
	 	$('.ss_btn_cancel').click(function(){
			 $('.ssCheck').toggleClass('display-none1');			//체크박스

			 $('.ss_btn_reset').addClass('display-none1');   //초기화 초기값 none
			 $('.ss_btn_confirm').addClass('display-none1'); //확인 초기값 none
			 $('.ss_btn_cancel').addClass('display-none1');  //취소 초기값 none
 
			 $('.ss_btn_svcall').removeClass('display-none1');   //서비스전체보기
			 $('.ss_btn_setting').removeClass('display-none1');  //메뉴설정
	 	});


		 
	 	/* close 버튼을 눌렀을대 이벤트 */
	 	$('.ss_btn_close').click(function(){
			

		 $('.dropClose').addClass('display-none1'); 			//밑에 하얀창 + 불투명 검은창 없에기
		 $('.ss_btn_svcall').addClass('display-none1');   //서비스전체보기
		 $('.ss_btn_setting').addClass('display-none1');  //메뉴설정
		 $('.ss_btn_close').addClass('display-none1');    // close X 버튼

		 $('.dropBoxMenu1').addClass('display-none1');  //위에 하얀화면
		 $('.dropBoxMenu2').addClass('display-none1');  //아래 검은화면
		 $('.ss_btns').addClass('display-none1');   //서비스화면 + 메뉴설정 덮고 있는 div
		 $('.realtime-search').removeClass('display-none1');  //검색창
		 
		//  $('.an_mtxt').addClass('display-none1');   // 더보기 눌렀을대 접기이미지 표기
			

		 
		});
});


// var base = ["","","","","",]; 기본메뉴
// input에 value값을 지정
