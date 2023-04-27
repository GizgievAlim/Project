package domain

import models.ClothesView

class UseCaseImpl (private val repository: Repository) :UseCase{
    override fun getClothesById(id :Long){
        TODO()
    }
    override fun getClothesByView(view : ClothesView){
        TODO()
    }
    override fun getClothesCount(view: ClothesView) :Int{
        TODO()
    }
}