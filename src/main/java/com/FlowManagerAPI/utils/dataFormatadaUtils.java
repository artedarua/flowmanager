package com.FlowManagerAPI.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class dataFormatadaUtils {

	public String  DataMomento() {
	LocalDateTime now = LocalDateTime.now();
   
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    
    String formattedNow = now.format(formatter);
    
    return formattedNow;
}
}