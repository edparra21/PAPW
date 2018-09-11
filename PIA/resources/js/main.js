window.onscroll = function() {myFunction()};

var menu = document.getElementById("menu");
var sticky = menu.offsetTop;

function myFunction() {
  if (window.pageYOffset >= sticky){ 
    menu.classList.add("sticky");
  } else {
    menu.classList.remove("sticky");
  }
}


function testAnim(x) {
    $('#animationSandbox').removeClass().addClass(x + ' animated').one('webkitAnimationEnd mozAnimationEnd MSAnimationEnd oanimationend animationend', function(){
      $(this).removeClass();
    });
  };

  $(document).ready(function(){
    $('.js--triggerAnimation').click(function(e){
      e.preventDefault();
      var anim = $('.js--animations').val();
      testAnim(anim);
    });

    $('.js--animations').change(function(){
      var anim = $(this).val();
      testAnim(anim);
    });
  });

