package com.example.utils
 


class MessageFormatter {

 static String formatMessage(String message, String enviroment){
  return "[${enviroment}] -${message}"
 }
   

}