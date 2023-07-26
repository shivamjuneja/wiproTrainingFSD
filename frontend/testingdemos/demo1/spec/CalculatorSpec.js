
describe("test suite for calculator", () => {

    it("isEven, number is even", () => {
        let result = isEven(10);
        expect(result).toBeTruthy();

    });


    it("isEven, number is odd", () => {
        let result = isEven(7);
        expect(result).toBeFalsy();

    });

    it("add, numbers are positive", () => {
        let result = add(2, 3);
        expect(result).toEqual(5);

    });


    it("add, numbers are negative", () => {
        let result = add(-4, -5);
        expect(result).toEqual(-9);

    });

    it("newUser", ()=>{
      let expected={
          id:1,
          name:'divyanshu'
      }  ;
     let result= newUser(1,'divyanshu');   
      expect(result).toEqual(expected);
    } );


});