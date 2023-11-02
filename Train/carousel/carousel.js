// shadebanner 만드는 방법
// 1. 변수 지정 
// 인덱스 , 순회할 대상, 버튼

let shadeBannerIndex = 0;
const $shadeBanner = document.querySelectorAll("#shade-banner > ul > li");
const $shadeBannerPrevBtn = document.querySelector(".shade-prev-btn");
const $shadeBannerNextBtn = document.querySelector(".shade-next-btn");

// 2. 투명도(opacity) 변경 함수 생성
// 객체가 아니므로 순회가 가능한..?
// list 순회하기 --> li를 순회해야 함
// 돌면서 맞으면 투명도 1, 아니면 0

const renderShadeBanner = () => {
    $shadeBanner.forEach((banner, index) => {
        if(index === shadeBannerIndex){
            banner.style.opacity = 1;
        } else {
            banner.style.opacity = 0;
        }
    });
};

// 3. 인덱스 변경 함수 생성
// 2번을 움직여야 하므로
// '인덱스'를 바꾸는 함수를 만들어야 함
// prev, next 두 개
// prev : 앞으로 가다 처음이 되면 --> 마지막 인덱스 
// next : 뒤로 가다 마지막이 되면 --> 처음 인덱스
// ★ 처음에서 prev를 누른다면? (핵심파악!)
// ★ 인덱스 이동하면 이제 뭘 움직여야 할까? 

const prevShadeBanner = () => {
    if(shadeBannerIndex <= 0){
        shadeBannerIndex = $shadeBanner.length-1;
    } else {
        shadeBannerIndex--;
    }
    renderShadeBanner();
}

const nextShadeBenner = () => {
    if(shadeBannerIndex >= $shadeBanner.length-1){
        shadeBannerIndex = 0;
    } else {
        shadeBannerIndex++;
    }
    renderShadeBanner();
}
// 4. 버튼 연결
// addEventListener 손이 안 감..
$shadeBannerPrevBtn.addEventListener('click', prevShadeBanner);
$shadeBannerNextBtn.addEventListener('click', nextShadeBenner);


//------------------------------------------------------------------

// slide 만들기
// 1. 변수 지정
// 인덱스 , 순회할 대상, 버튼
// ★ slide에서는 감싼 애를 이동시켜야 한다
// ★ clientWidth : 너비

let slideBannerIndex = 0;
const $slideBanner = document.querySelector("#slide-banner > ul")
const $slideBannerItem = document.querySelectorAll("#slide-banner > ul > li");
const $slideBannerPrevBtn = document.querySelector(".slide-prev-btn");
const $slideBannerNextBtn = document.querySelector(".slide-next-btn");
const slideBannerWidth = $slideBanner.clientWidth;

// 2. 밀기 함수 생성
// 인덱스 옮기고 밀어버리는 거
// 한번에 해도 됨

const prevSlideBanner = () => {
    if (slideBannerIndex <= 0) {
      slideBannerIndex = $slideBannerItem.length - 1;
    } else {
      slideBannerIndex--;
    }
    $slideBanner.style.transform = `translateX(-${slideBannerWidth * slideBannerIndex}px)`;
  };


const nextSlideBanner = () => {
    if(slideBannerIndex >= $slideBannerItem.length-1){
    } else {
        slideBannerIndex++;
    }
    $slideBanner.style.transform = `translateX(-${slideBannerWidth * slideBannerIndex}px)`;
}

$slideBannerPrevBtn.addEventListener('click', prevSlideBanner);
$slideBannerNextBtn.addEventListener('click', nextSlideBanner);


