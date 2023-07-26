var Calculator = /** @class */ (function () {
    function Calculator() {
    }
    Calculator.prototype.add = function (num1, num2) {
        var result = num1 + num2;
        return result;
    };
    return Calculator;
}());
var calcy = new Calculator();
var result = calcy.add(2, 5);
console.log("result=" + result);
