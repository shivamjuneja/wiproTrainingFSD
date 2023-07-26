

Customer{

id: number

name : String

age: number 

balance: number

credit(val) : void 

debit(val): void

displayDetails() // display details

}

RegularCustomer extends Customer{

offer:String 

displayDetails() // display details

}

BusinessCustomer extends Customer{

discount: double 

displayDetails() // display details

}





store/array of Customer  

add regular customers and business customer in the store

iterate and display all customers in array




