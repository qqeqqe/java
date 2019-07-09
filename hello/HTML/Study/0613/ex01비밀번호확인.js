function checkPwConfirm(idpw1, idpw2){
	var pw1 = document.getElementById(idpw1).value;
	var pw2 = document.getElementById(idpw2).value;
	if(!checkPw(pw1, min, max)){
		return;
	}

	if( pw1 == pw2){
		alert('비밀번호가 일치합니다.');
		return;
	}else{
		alert('비밀번호가 일치하지 않습니다.');
		return;
	}
}


function checkStrLength(str, min, max){
	if(str.length > max || str.length < min){
		return false;
	
	}
	return true;
}



function checkPw(str, min, max){
	if(!checkStrLength(str, min, max)){
		alert('비밀번호는'+ min + '~' + max + '자리입니다');
		return false;
	}
	return true;
}