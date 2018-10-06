package com.example.samliew.coderswag.Services

import com.example.samliew.coderswag.Model.Category
import com.example.samliew.coderswag.Model.Product

object DataService{

    val categories = listOf(Category("SHIRTS","shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS","hatimage"),
            Category("DIGITAL","digitalgoodsimage"))

    val hats = listOf(Product("Devslopes Graphic Beanie","hat01","RM18"),
            Product("Devslopes Hat Black","hat02","RM20"),
            Product("Devslopes Hat White","hat03","RM22"),
            Product("Devslopes Hat Snapback","hat04","RM25")
            )

    val hoodies = listOf(Product("Devslopes Hoodie Gray","hoodie01","RM28"),
            Product("Devslopes Hoodie Red","hoodie02","RM30"),
            Product("Devslopes Gray Hoodie","hoodie03","RM32"),
            Product("Devslopes Black Hoodie","hoodie04","RM28"))

    val shirts = listOf(Product("Devslopes Shirt Gray","shirt01","RM18"),
            Product("Devslopes Badge Light Grey","shirt02","RM20"),
            Product("Devslopes Logo Shirt Red","shirt03","RM19"),
            Product("Devslopes Hustle","shirt04","RM22"),
            Product("Kickflip Studio","shirt05","RM18"))


}