package domain

import models.clothesView

class UseCaseImpl (private val repository: Repository) :UseCase{
    override fun getClothesById(id :Long){
        TODO()
    }
    override fun getClothesByView(view : clothesView){
        TODO()
    }
    override fun getClothesCount(view: clothesView) :Int{
        TODO()
    }
}