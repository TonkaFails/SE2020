function calc() {

    var price = 110;
    var sum = 0;

    var dateBegin = document.getElementById("begin").value;
    var dateEnd = document.getElementById("end").value;

    var diff = Math.floor((Date.parse(dateEnd) - Date.parse(dateBegin)) / 86400000);

    if (diff <= 0) {
        window.alert("Zeitraum " + diff + " Tage nicht sinnvoll");
        return false;
    }


    var pricetype = document.getElementById('pricetype');

    dateBegin = dateBegin.split('-');
    dateEnd = dateEnd.split('-');

    if (dateBegin[1] <= 2 || dateBegin[1] >= 11) {
        price = 150;
        pricetype.innerHTML = "Winterpreis";
    }
    if (6 <= dateBegin[1] && dateBegin[1] <= 9) {
        price = 130;
        pricetype.innerHTML = "Sommerpreis";
    }

    sum = sum + price * diff;

    changeTag(sum, diff);

    // false return da keine Anbindung an eine Platform besteht
    return false;

}

function changeTag(sum, days) {

    var pricetag = document.getElementById('endprice');
    pricetag.innerHTML = sum + "€ für " + days + " Nächte";
}