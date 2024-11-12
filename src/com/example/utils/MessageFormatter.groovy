package com.example.utils
 


class MessageFormatter {

 static String formatMessage(String message, string enviroment){
  return "[${enviroment}] -${message}"
 }
   

}