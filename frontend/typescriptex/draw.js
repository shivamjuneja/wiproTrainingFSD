var Canvas = /** @class */ (function () {
    function Canvas(square) {
        this.square = square;
    }
    Canvas.prototype.setSquare = function (square) {
        this.square = square;
    };
    Canvas.prototype.drawShape = function () {
        var areaVal = this.square.area();
        console.log("drawing shape with area " + areaVal);
    };
    return Canvas;
}());
var Square = /** @class */ (function () {
    function Square(side) {
        this.side = side;
    }
    Square.prototype.area = function () {
        return this.side * this.side;
    };
    return Square;
}());
var square1 = new Square(5);
var canvas1 = new Canvas(square1);
canvas1.drawShape();
var square2 = new Square(10);
var canvas2 = new Canvas(square2);
canvas2.drawShape();
