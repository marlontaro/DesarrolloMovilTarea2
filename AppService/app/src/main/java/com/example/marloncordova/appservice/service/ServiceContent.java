package com.example.marloncordova.appservice.service;


import android.content.Context;
import android.content.res.Resources;

import com.example.marloncordova.appservice.models.Service;

import java.util.ArrayList;
import java.util.List;
import com.example.marloncordova.appservice.R;

public class ServiceContent {
    private List<Service> oListService;
    public List<Service> getService() { return oListService; }

    public ServiceContent(Context context) {
        Resources res = context.getResources();
        oListService = new ArrayList<>();
        oListService.add(Service.build(1,"Desarrollo de Software","Mediante nuestro Software Factory aseguramos el desarrollo de software de calidad, ya que utilizamos metodologías formales de desarrollo, lenguajes de programación de vanguardia y realizamos la gestión de proyectos basadas en PMI."
                ,"Principales Clientes: Practical Action",R.drawable.servicio1));
        oListService.add(Service.build(2,"Consultoria","En este servicio de consultoría enfocada al proceso de adquisición e implementación de un ERP, se busca asegurar el éxito del proyecto. Nuestros consultores se comportarán como gerentes de proyecto especializados en este tipo de proyectos. Es muy importante que la compañía cuente con un rol imparcial que fiscalice el avance de ambas partes y le reporte directamente a la gerencia sobre la realidad y status del proyecto. El consultor asignado por SOEN tendrá el objetivo de reducir el riesgo de terminar el proyecto con atraso y fuera del presupuesto."
                ,"Principales Clientes: Grupo Romero",R.drawable.servicio2));
        oListService.add(Service.build(3,"Startup","Este programa tiene la premisa de reducir la burocracia y complejidad que existe para poder presentar una idea de negocio. Aquí, el innovador solicita a SOEN Startup se le asigne  un asesor para que haga una presentación inicial de su idea de negocio. En esta reunión,  el asesor tendrá la responsabilidad de darle las oportunidades de mejora que identifica para que la presentación tenga la calidad necesaria para ser presentada a un inversionista ángel. Una vez que la presentación esté lista, el asesor organizará presentaciones formales frente a los inversionistas interesados y empezará la negociación que dará inicio al emprendimiento."
                ,"Principales Clientes: CapaSOS, Nanapp",R.drawable.servicio3));

    }
}

