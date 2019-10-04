package com.company;

public class MobilePhone implements ITelephone {

    private int myPhoneNumber;
    private boolean isRinging;
    private boolean isOn = false;

    public MobilePhone(int myPhoneNumber) {
        this.myPhoneNumber = myPhoneNumber;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Mobile Phone Powered On");
    }

    @Override
    public void dial(int phoneNumber) {
        if (isOn) {
            System.out.println("Now ringing " + phoneNumber + " on mobile phone");
        } else {
            System.out.println("Phone is off");
        }
    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println("Answering the mobile phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (phoneNumber == myPhoneNumber && isOn) {
            isRinging = true;
            System.out.println("Ring-a-Ding!");
        } else {
            isRinging = false;
            System.out.println("Mobile Phone is Off or Incorrect Number");
        }

        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
