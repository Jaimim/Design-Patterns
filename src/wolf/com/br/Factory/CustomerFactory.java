/*
Esta classe mostra como trabalha o
padrão Factory Method
*/

package wolf.com.br.Factory;

/**
 * Created by wolf on 25/09/16.
 */
public class CustomerFactory {

    // Tipo que preciso para criar no método Factory.
    public abstract class Customer{
        public String name;
        public String typePerson;
    }

    // Tipo: Pessoa Física.
    class LegalPerson extends Customer {
        public LegalPerson(String name){
            this.name = name;
            System.out.println("Sejá bem vindo "+name);
        }
    }


    // Tipo: Pessoa Jurídica
    class PhysicalPerson extends Customer{
        public PhysicalPerson(String name){
            this.name = name;
            System.out.println("Sejá bem vindo "+name);
        }
    }

    // Construtor do cliente.
    class FactoryCustomer{

        public Customer getCustomer(String name, String typePerson){

            if (typePerson.equals("Física")){
                return new PhysicalPerson(name);
            }

            if(typePerson.equals("Juridíca")){
                return new LegalPerson(name);
            }
            return null;
        }

    }

}
