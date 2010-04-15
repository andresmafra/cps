package br.iteratorsystems.cps.controller;

import java.util.Locale;  
  
import javax.faces.component.UIViewRoot;  
import javax.faces.context.FacesContext;  
  
public class LocaleController {  
 private Locale currentLocale = new Locale("pt", "BR");  
 
 public void englishLocale() {  
  UIViewRoot viewRoot = FacesContext.getCurrentInstance().getViewRoot();  
  currentLocale = Locale.US;  
  viewRoot.setLocale(currentLocale);  
 }  
  
 public void portugueseLocale() {  
  UIViewRoot viewRoot = FacesContext.getCurrentInstance().getViewRoot();  
  currentLocale = new Locale("pt", "BR");  
  viewRoot.setLocale(currentLocale);  
 }  
  
 public Locale getCurrentLocale() {  
  return currentLocale;  
 }  
 
}