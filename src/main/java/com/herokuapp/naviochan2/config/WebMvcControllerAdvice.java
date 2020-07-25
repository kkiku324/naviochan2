package com.herokuapp.naviochan2.config;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;


/**
 * �S�Ă�Controller�ŋ��ʏ������`
 */
@ControllerAdvice
public class WebMvcControllerAdvice {

	/*
	 * This method changes empty character to null
	 * ������̃��\�b�h��p�ӂ��Ă����Ƒ��M���ꂽ�󕶎���null�ɕϊ�����܂�
	 */
    @InitBinder
    public void initBinder(WebDataBinder dataBinder) {
        dataBinder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
    }
   
}
