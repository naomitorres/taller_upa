package com.example.myapplication.data

object constants {

    object UserData {
        const val USER_ID = "id"
        const val PASSWORD = "password"
        const val ROL = "rol"
        const val EMAIL = "email"
        const val PHONE = "phone"
        const val NAME = "name"
    }

    object API{

        const val API_TOKEN = "api_token"
        //        const val API_URL = "http://144.126.218.176:8080/tibu/" //Servidor de producción
///const val API_URL = "http://192.168.0.23:8090/" //Pruebas locales
//        const val API_URL = "http://96eaf4b04dcc.ngrok.io/"
        const val API_URL = "http://143.202.78.12:8858/tibu/" //Servidor de pruebas
        //     const val API_URL = "https://admin.tibuapp.com/tibu/" //Dominio de produccion
        const val API_VERSION = "v1.0.0"
    }

    const val VALID = 0
    const val EMPTY_TEXT = 1
    const val NOT_AUTHORICED = 5
    const val PASSWORDS_NOT_EQUALS = 6

    const val LOCATION_UPDATE_INTERVAL = 10000L
    const val FASTEST_LOCATION_UPDATE_INTERVAL = 10000L

    const val ACTION_START_TRACKING = "ACTION_START_TRACKING"
    const val ACTION_STOP_TRACKING = "ACTION_STOP_TRACKING"

    const val REQUEST_LOCATION_CODE = 1

    const val NOTIFICATION_CHANNEL_ID = "tibu_cliente_channel"
    const val NOTIFICATION_CHANNEL_NAME = "Tibu Servicios"
    const val NOTIFICATION_ID = 2

    const val CONTRACT_ACTIVITY = "CONTRACT_ACTIVITY"
    const val CONTRACT_CHAT_ACTIVITY = "CONTRACT_CHAT_ACTIVITY"
    const val HISTORY_ACTIVITY = "HISTORY_ACTIVITY"



}