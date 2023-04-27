package domain

import models.clothesView

interface UseCase {
    fun getClothesById(id :Long)
    fun getClothesByView(view :clothesView)
    fun getClothesCount(view:clothesView) :Int
}