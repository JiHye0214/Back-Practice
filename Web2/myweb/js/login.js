function goToLogIn(){
    alert("로그인 먼저 하세요");
    location.href = 'http://127.0.0.1:5501/Web2/myweb/signForm.html'
}

function BTNlogin() {
    const frm = document.forms['form'];
    
    if(frm['id'].value.trim() == "" || frm['pw'].value.trim() == "" ){
        showId();
        return false;
    }
    return true;
}

function showId(){
    const $msg = $('#warn-message');
    const $wrapper = $('#login-group');
    $wrapper.animate({'height' : '355px'}, 0)
    $msg.show()
}