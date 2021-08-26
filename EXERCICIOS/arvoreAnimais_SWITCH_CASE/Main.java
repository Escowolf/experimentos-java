import java.util.Scanner;
class Main {
  public static void main(String[] args) 
  {
    /*Construa um algoritmo que seja capaz de concluir qual dentre os seguintes animais foram escolhidos, através de perguntas e respostas. Animais possíveis:leão, cavalo, homem, macaco, morcego, baleia, avestruz, pinguim, pato, águia, tartaruga, crocodilo e cobra.*/

    Scanner animal = new Scanner(System.in);
    System.out.print("Podemos começar? ");
    String resposta = animal.next();

  switch (resposta)
  {
    case "sim":System.out.print("O animal é mamífero? ");
    resposta = animal.next();
        switch(resposta)
        {      
          case "sim":System.out.print("O animal é quadrupede? ");
          resposta = animal.next();
              switch(resposta)
              {
                case "sim":System.out.print("É carnívoro? ");
                resposta = animal.next();
                    switch(resposta)
                    {
                      case "sim":System.out.println("O animal é um leão!");break;
                      case "não":System.out.println("O animal é um cavalo!");break;
                    }
                    break;

                case "não":System.out.print("O animal é bípede? ");
                resposta = animal.next();
                    switch(resposta)
                    {
                        case "sim":System.out.print("É onívoro? ");
                        resposta = animal.next();
                            switch(resposta)
                            {
                                case "sim":System.out.println("O animal é o Homem!");break;
                                case "não":System.out.println("O animal é um macaco!");break;
                            }
                            break;            
      
                        case "não":System.out.print("O animal é voador? ");    resposta = animal.next();
                            switch(resposta)
                            {
                               case "sim":System.out.println("O animal é um morcego!");break;
                               case "não":System.out.println("O animal é uma Baleia!");break;
                            } 
                            break;
                    }
                    break;
              }break;

    case "não":System.out.print("O animal é uma ave? ");
    resposta = animal.next();
    {
        switch(resposta)
        {
          case "sim":System.out.print("Ela é não-voadora? ");
          resposta = animal.next();
              switch(resposta)
              {
                case "sim":System.out.print("É tropical? ");
                resposta = animal.next();
                    switch(resposta)
                    {
                      case "sim":System.out.println("O animal é uma avestruz!");break;
                      case "não":System.out.print("Ela é polar?");
                      resposta = animal.next();
                          switch(resposta)
                          {
                              case "sim":System.out.println("O animal é um pinguim!");break;
                          }
                          break;
                    }
              

                case "não":System.out.print("Ela é nadadora? ");
                resposta = animal.next();
                   switch(resposta)
                   {
                      case "sim":System.out.println("Então é um pato!");break;
                      case "não":System.out.println("Então, só pode ser uma águia!");break;
                    }
                    break;
              }
        
          case "não":System.out.print("O animal é um réptil? ");
          resposta = animal.next();
              switch(resposta)
              {
                case "sim":System.out.print("Com casco? ");
                resposta = animal.next();
                   switch(resposta)
                  {
                     case "sim":System.out.print("É uma tartaruga! ");
                     case "não":System.out.print("É carnívoro? ");
                     resposta =animal.next();
                         switch(resposta)
                         {
                           case "sim":System.out.println("O animal é um crocodilo!");break;
                           case "não":System.out.println("O animal é uma cobra!");break;
                         }
                         break;
                  }
              }

    }
    }
  }
  }
}
}
