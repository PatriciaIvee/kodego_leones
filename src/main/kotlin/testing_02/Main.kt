package testing_02

class Calculator{
    fun computeContribution(amount:Double, headCount:Int):Double?{
        var result = 0.0
//        throw exceeded amount
//        throw exceeded headcount exception

        if(amount > 1_000_000 || headCount > 50)
            return 0.0

        if(amount == 0.0 || headCount == 0)
            return 0.0

//        throw invalid input exception
        if (amount < 0.0 || headCount < 0)
            return null

        result = amount/ headCount
        return result
    }
}
