package calendario;
import javax.swing.JOptionPane;

public class principal {
    public static void main (String[] args) {
		
		String mes[]= {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
		String febBis[]= {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29"};
		String feb[]= {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28"};
		String mes31[]= {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
		String mes30[]= {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30"};
		String dias[]= {"Domingo", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado"};
		
                             int year;
                             String month;
		String diabis;
		String dianobi;
		String dia30;
		String dia31;
		int diaOpe=0;
		int añoBusc=0;
		int dayU=0;
		int febdia=0;
		int fecha=0;
		
		do {
		year=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un año"));
		if (year>1900 && year<2100) {
			
			month=(String) JOptionPane.showInputDialog(null,"Seleccione un mes de la lista.", "Elija un mes.",JOptionPane.QUESTION_MESSAGE,null,mes,mes[0]);
			
			if(year%4==0) {
				if (month.equals("Febrero")) {
					diabis=(String) JOptionPane.showInputDialog(null,"Seleccione un dia del mes por favor","Elija un dia",JOptionPane.QUESTION_MESSAGE,null,febBis,febBis[0]);	
					dayU=Integer.parseInt(diabis);
				}
				else if ( month.equals("Enero") || month.equals("Marzo") || month.equals("Mayo") || month.equals("Julio") || month.equals("Agosto") || month.equals("Octubre") || month.equals("Diciembre")){
					dia31=(String) JOptionPane.showInputDialog(null,"Seleccione un dia del mes por favor","Elija un dia",JOptionPane.QUESTION_MESSAGE,null,mes31,mes31[0]);
					dayU=Integer.parseInt(dia31);
				}
				else if ( month.equals("Abril") || month.equals("Junio") || month.equals("Septiembre") || month.equals("Noviembre")) {
					dia30=(String) JOptionPane.showInputDialog(null,"Seleccione un dia del mes por favor","Elija un dia",JOptionPane.QUESTION_MESSAGE,null,mes30,mes30[0]);
					dayU=Integer.parseInt(dia30);
				}
			}
			
			else {
				if (month.equals("Febrero")) {
					dianobi=(String) JOptionPane.showInputDialog(null,"Seleccione un dia del mes por favor","Elija un dia",JOptionPane.QUESTION_MESSAGE,null,feb,feb[0]);
					dayU=Integer.parseInt(dianobi);
				}
				else if ( month.equals("Enero") || month.equals("Marzo") || month.equals("Mayo") || month.equals("Julio") || month.equals("Agosto") || month.equals("Octubre") || month.equals("Diciembre")){
					dia31=(String) JOptionPane.showInputDialog(null,"Seleccione un dia del mes por favor","Elija un dia",JOptionPane.QUESTION_MESSAGE,null,mes31,mes31[0]);
					dayU=Integer.parseInt(dia31);
				}
				else if ( month.equals("Abril") || month.equals("Junio") || month.equals("Septiembre") || month.equals("Noviembre")) {
					dia30=(String) JOptionPane.showInputDialog(null,"Seleccione un dia del mes por favor","Elija un dia",JOptionPane.QUESTION_MESSAGE,null,mes30,mes30[0]);
					dayU=Integer.parseInt(dia30);
				}
			}
			
			
			
			for (int año=1; año<=year;año++) {
				if ((año-1)!=0 && (año-1)%4==0) {
					diaOpe=diaOpe+2;
					if (diaOpe==8){
						diaOpe=1;
					}
					else if (diaOpe==9) {
						diaOpe=2;
					}
				}
				
				else {
					diaOpe=diaOpe+1;
					if (diaOpe==8) {
						diaOpe=1;
					}
				}
			  }	
			
			if (year%4==0) {
					febdia=29;
			}
			
			else {
				
					febdia=28;
			}
			
			switch (month){
				case "Enero":
					fecha=dayU;
					break;
				case "Febrero":
					fecha=31+dayU;
					break;
				case "Marzo":
					fecha=31+febdia+dayU;
					break;
				case "Abril":
					fecha=31+febdia+31+dayU;
					break;
				case "Mayo":
					fecha=31+febdia+31+30+dayU;
					break;
				case "Junio":
					fecha=31+febdia+31+30+31+dayU;
					break;
				case "Julio":
					fecha=31+febdia+31+30+31+30+dayU;
					break;
				case "Agosto":
					fecha=31+febdia+31+30+31+30+31+dayU;
					break;
				case "Septiembre":
					fecha=31+febdia+31+30+31+30+31+31+dayU;
					break;
				case "Octubre":
					fecha=31+febdia+31+30+31+30+31+31+30+dayU;
					break;
				case "Noviembre":
					fecha=31+febdia+31+30+31+30+31+31+30+31+dayU;
					break;
				case "Diciembre":
					fecha=31+febdia+31+30+31+30+31+31+30+31+30+dayU;
					break;
			}
			int semana=fecha%7;
			semana=semana+diaOpe-1;
			if (semana==8) {
				semana=1;
			}
			else if (semana==9) {
				semana=2;
			} 
			else if(semana==10) {
				semana=3;
			}
			else if(semana==11) {
				semana=4;
			}
			else if(semana==12) {
				semana=5;
			}
			
			JOptionPane.showMessageDialog(null, dayU+" de "+month+" de "+year+" - "+dias[semana-1]);
			}	
			else {
			JOptionPane.showMessageDialog(null,"El año que ingreso no esta dentro del rango permitido.\n Por favor, vuelva a ingresar el año.");
			}
		
		
		}while(year<1 || year>3000);
    }
}
