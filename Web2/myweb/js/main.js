let slideBannerIndex = 0;
const $slideBanner = document.querySelector("#slide-banner > ul");
const $slideBannerItem = document.querySelectorAll("#slide-banner > ul > li");
const $slideBannerPrevBtn = document.querySelector(".slide-prev-btn");
const $slideBannerNextBtn = document.querySelector(".slide-next-btn");
const slideBannerWidth = $slideBanner.clientWidth;

const prevSlideBanner = () => {
  if (slideBannerIndex <= 0) {
    slideBannerIndex = $slideBannerItem.length - 1;
  } else {
    slideBannerIndex--;
  }
  console.log(slideBannerWidth * slideBannerIndex);
  $slideBanner.style.transform = `translateX(-${slideBannerWidth * slideBannerIndex}px)`;
};

const nextSlideBanner = () => {
  if (slideBannerIndex >= $slideBannerItem.length - 1) {
    slideBannerIndex = 0;
  } else {
    slideBannerIndex++;
  }
  console.log(slideBannerWidth * slideBannerIndex);
  $slideBanner.style.transform = `translateX(-${slideBannerWidth * slideBannerIndex}px)`;
};

$slideBannerPrevBtn.addEventListener("click", prevSlideBanner);
$slideBannerNextBtn.addEventListener("click", nextSlideBanner);