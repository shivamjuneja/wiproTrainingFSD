class Canvas {
  square: Square ;

  constructor(square:Square){
      this.square = square;
  }

  setSquare(square:Square){
  this.square = square;
  }

  drawShape(): void {
    const areaVal = this.square.area();
    console.log("drawing shape with area " + areaVal);
  }
}

class Square {
  constructor(public side: number) {}

  area(): number {
    return this.side * this.side;
  }
}


const square1:Square=new Square(5);
const canvas1: Canvas = new Canvas(square1);
canvas1.drawShape();

const square2:Square=new Square(10);
const canvas2:Canvas=new Canvas(square2);
canvas2.drawShape();