package ejercicios.clases.wrappers;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// byte primitivo
		byte datoByte=2;
		// byte wrapper
		Byte datoByteWrapper=3;
		System.out.println("primitivo:"+datoByte);
		System.out.println("wrapper"+datoByteWrapper);
		// conversiones
		byte datoByte1=6;
		Byte datoConvertido=datoByte1;
		System.out.println("Byte convertido:"+datoConvertido);
		//conversiones 2
		Byte datoConvertido2=6;
		byte datoByte2=datoConvertido2.byteValue();
		System.out.println("Byte convertido:"+datoByte2);
		
		
		// short primitivo
		short datoShort=1;
		// short wrapper
		Short datoShortWrapper=1;
		System.out.println("primitivo:"+datoShort);
		System.out.println("wrapper"+datoShortWrapper);
		//conversiones
		short datoShort1=4;
		Short shortConvertido=datoShort1;
		System.out.println("short convertido:"+shortConvertido);
		//conversiones 2
		Short shortConvertido2=5;
		short datoShort2=shortConvertido2.shortValue();
		System.out.println("Short convertido:"+datoShort2);
		
		//int primitivo
		int edad=45;
		//int wrapper
		Integer edadWrapper=48;
		System.out.println("primitivo:"+edad);
		System.out.println("wrapper"+edadWrapper);
		//conversiones
		int edad1=45;
		Integer integerConvertido=edad1;
		System.out.println("Integer convertido:"+integerConvertido);
		//conversiones 2
		Integer integerConvertido2=23;
		int edad2=integerConvertido2.intValue();
		System.out.println("Int convertido:"+edad2);
		
		//long primitivo
		long valorGrande=125444;
		//long wrapper
		Long valorGrandeWrapper=125479L;
		System.out.println("primitivo:"+valorGrande);
		System.out.println("wrapper"+valorGrandeWrapper);
		//convertido
		long valorGrande1=12458L;
		Long longConvertido1=valorGrande1;
		System.out.println("Long convertido:"+longConvertido1);
		//convertido 2
		Long longConvertido2=126479L;
		long valorGrande2=longConvertido2.longValue();
		System.out.println("Long convertido:"+valorGrande2);
		
		//boolean primitivo
		boolean respuesta=false;
		//boolean wrapper
		Boolean respuestaWrapper=true;
		System.out.println("primitivo:"+respuesta);
		System.out.println("wrapper"+respuestaWrapper);
		//convertido
		boolean respuesta1=false;
		Boolean booleanConvertido1=respuesta1;
		System.out.println("boolean convertido:"+booleanConvertido1);
		//convertido 2
		Boolean booleanConvertido2=true;
		boolean respuesta2=booleanConvertido2.booleanValue();
		System.out.println("Boolean convertido:"+respuesta2);
		
		//float primitivo
		float cantidad=9;
		//float Wrapper
		Float cantidadWrapper=10f;
		System.out.println("primitivo:"+cantidad);
		System.out.println("wrapper"+cantidadWrapper);
		//convertido
		float cantidad1=10;
		Float floatConvertido1=cantidad1;
		System.out.println("float convertido:"+floatConvertido1);
		//convertido 2
		Float floatConvertido2=11f;
		float cantidad2=floatConvertido2.floatValue();
		System.out.println("Float convertido:"+cantidad2);
		
		//double primitivo
		double numero=8;
		//double Wrapper
		Double numeroWrapper=7d;
		System.out.println("primitivo:"+numero);
		System.out.println("wrapper"+numeroWrapper);
		//convertido
		double numero1=4;
		Double doubleConvertido1=numero1;
		System.out.println("double convertido:"+doubleConvertido1);
		//convertido 2
		Double doubleConvertido2=7d;
		double numero2=doubleConvertido2.doubleValue();
		System.out.println("Double convertido:"+numero2);
		
		//char primitivo
		char vocal='a';
		//char wrapper
		Character vocalWrapper='n';
		System.out.println("primitivo:"+vocal);
		System.out.println("wrapper"+vocalWrapper);
		//convertido
		char vocal1='e';
		Character charConvertido1=vocal1;
		System.out.println("char convertido:"+charConvertido1);
		//convertido 2
		Character charConvertido2='b';
		char vocal2=charConvertido2.charValue();
		System.out.println("Character convertido:"+vocal2);

	}

}
