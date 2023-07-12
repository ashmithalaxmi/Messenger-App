import java.util.Scanner;



interface Message{
    void sendMessage();
}

class Sms implements Message {

    public void sendMessage()  {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Phone Number to send message");
        String phoneNumber = sc.nextLine();
        String regex= ("[6-9]\\d{9}");
        if(phoneNumber.matches(regex)){
            System.out.println("Enter your message to send");
            String smsMessage = sc.nextLine();
            System.out.println("SMS  sent successfully");
        }
        else{
            System.out.println("Invalid Phone Number");
        }
        }
    }


class Email implements Message {
        public void sendMessage() {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the Email Id to send message");
            String email = sc.nextLine();
            String regexEmail= ("^[a-zA-Z0-9+_.-]+@(.+)$");
            if(email.matches(regexEmail)){
                System.out.println("Enter your Email Heading:");
                String emailHead = sc.nextLine();
                System.out.println("Enter your Email body");
                String emailBody=sc.nextLine();
                System.out.println("Email  sent successfully");
            }
            else{
                System.out.println("Invalid Email");
            }
        }
    }


class Whatsapp implements Message{
    public void sendMessage(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Phone Number to send WhatsApp message");
        String phoneNumber = sc.nextLine();
        String regex= ("[6-9]\\d{9}");
            if(phoneNumber.matches(regex)){
                System.out.println("Whether the provided phone number has WhatsApp Facility? (yes/no)");
                String ans = sc.nextLine();
                if(ans.equals("yes")){
                    System.out.println("Enter message to be sent in WhatsApp: ");
                    String smsMessage = sc.nextLine();
                    System.out.println("WhatApp has been done successfully");
                }
                else{
                    System.out.println("Provide a WhatsApp Number");
                }
            }
            else{
                System.out.println("Invalid Phone Number");
            }

    }
}


public class Messenger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Message smsService = new Sms();
        Email emailService = new Email();
        Whatsapp watsappService = new Whatsapp();
        while (true) {
            System.out.println("\n\nMessaging Service \nEnter 1 to send SMS\nEnter 2 to send Email\nEnter 3 to send WhatsApp Message \nEnter 4 to exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    smsService.sendMessage();
                    break;
                case 2:
                    emailService.sendMessage();
                    break;
                case 3:
                    watsappService.sendMessage();
                    break;
                case 4:
                    System.exit(0);

            }

        }
    }
}