package com.shared-test.utils
 


class MessageFormatter {

 static String formatMessage(String message, string enviroment){
  return "[${enviroment}] -${message}"
 }
   

}