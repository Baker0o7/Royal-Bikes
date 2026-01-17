package com.royalbikes.app

class MpesaService {
    fun pay(phone: String, amount: Int, callback: (Boolean) -> Unit) {
        callback(true)
    }
}

