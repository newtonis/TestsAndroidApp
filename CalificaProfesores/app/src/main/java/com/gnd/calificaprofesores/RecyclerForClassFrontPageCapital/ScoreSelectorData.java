package com.gnd.calificaprofesores.RecyclerForClassFrontPageCapital;

/** layout_score_selector.xml **/

// si hasCategories=1 no hay seleccion de conocimiento, amabilidad o clases, solo puntaje

public class ScoreSelectorData extends AdapterElement {
    Integer []itemsValue;
    public ScoreSelectorData(Integer v1, Integer v2, Integer v3){
        super(5);
        itemsValue = new Integer[3];

        itemsValue[0] = v1;
        itemsValue[1] = v2;
        itemsValue[2] = v3;

    }

    public Integer[] getItemsValue() {
        return itemsValue;
    }

    public void setItemsValue(Integer[] itemsValue) {
        this.itemsValue = itemsValue;
    }
    public Integer GetValue(Integer item){
        return itemsValue[item];
    }
    public void SetValue(Integer item, Integer value){
        itemsValue[item] = value;
    }
}
