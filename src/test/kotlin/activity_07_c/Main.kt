package activity_07_c

import activity_06_c.GroceryException
import mu.KotlinLogging

private val logger = KotlinLogging.logger {  }

/**
 * Create the unit test for adding
 * items in the Cart as well as checking out the items in cart.
 */


    class Cart {


        //    CHECK CART ITEMS WITH THROW EXCEPTION
        fun checkGrocery(product: String, price:Double, total: Double,){

            if ( total  > 500_000.0){
                throw GroceryException.CartInputException.InputHasReachedLimit()
            }

            if (product.isBlank()){
                throw GroceryException.CartInputException.InputNoName()
            }

            if (price == 0.0){
                throw GroceryException.CartInputException.InputNoAmount()
            }


        }
        fun checkPayment(payment: Double, total:Double ){
//            var change = total - payment
            if (payment < total){
                throw GroceryException.BuyerException.PaymentNotEnough()
            }
            else {
                var change = total - payment
                logger.info { "Change: $change" }
            }

            if (payment < 0.0){
                throw GroceryException.CartInputException.NegativeInput()
            }
        }
    }
