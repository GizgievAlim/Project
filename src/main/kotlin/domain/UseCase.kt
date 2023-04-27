package domain

import models.ClothesView

interface UseCase {
    fun getClothesById(id :Long)
    fun getClothesByView(view :ClothesView)
    fun getClothesCount(view:ClothesView) :Int
}