package com.udhay.demolibrary.model

/**
 * The data class representing product info.
 * This is a standard data object which will be returned by the Posit layer for product information
 * */
data class Product(
    val productId: Int, // The product Id as maintained by Posit
    val name: String, // The general category of the product eg.., shirt, pants
    val imageUrl: String, //The image url of the product obtained from the market place
    val firstAppearance: Int, // Represents the frame of the video at which at the product initially appeared
    val productUrl: List<String>, // List of urls from where the product can be purchased
    val price: Int // the average price of the product
)