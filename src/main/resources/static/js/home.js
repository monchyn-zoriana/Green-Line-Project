$("#logo").click(function () {

    window.open('/home', "_self");

});

$("#btnHome").click(function () {

    window.open('/home', "_self");

});
$("#btnCar").click(function () {

    window.open('/electro-car', "_self");

});
$("#btnAllCar").click(function () {

    window.open('/catalog-auto', "_self");

});

$("#btnPaymentAndDelivery").click(function () {

    window.open('/payment-and-delivery', "_self");

});
$("#btnContact").click(function () {

    window.open('/contacts', "_self");

});

$("#btnRegister").click(function () {


    window.open('/register', "_self");

});

$("#btnLogin").click(function () {

    var user = {
        email: $("#email").val(),
        password: $("#password").val()
    }

    console.log(user);

    $.ajax({
        url: "/login",
        type: "POST",
        contentType: "application/json",
        data: JSON.stringify(user),
        success: function (user) {
            alert("+");
            localStorage.setItem('currentUser', user.email);
            window.open('/home', "_self");
        },
        error: function (xhr, status, error) {
            var err = eval("(" + xhr.responseText + ")");
            alert(err.message);
        }
    });
});

$("#welcomeField").text(localStorage.getItem('currentUser'));







