function thankyou() {

  var checkBox = document.getElementById("check").checked;
  var button = document.getElementById("buttonSend");

  if (checkBox == true) {

    if (validateForm() == true) {

      var msg = "Vielen Dank für Ihre Nachricht";
      window.alert(msg);
    }
  }
  if (checkBox == false) {
    var msg = "Sie müssen zuerst der Datenverarbeitung zustimmen";
    window.alert(msg);
  }

}

function validateForm() {
  var x = document.forms["contact"]["name"].value;
  if (x == "") {
    return false;
  }
  var y = document.forms["contact"]["email"].value;
  if (y == "") {
    return false;
  }
}