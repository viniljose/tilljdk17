package com.vinil;

public class SwitchExpression {
    public static void main(String[] args) {
        SwitchExpression switchExpression = new SwitchExpression();
        System.out.println(switchExpression.oldSwitch("verna"));
        System.out.println(switchExpression.newSwitch("baleno"));

    }

    private String  oldSwitch(String car){
        String brand;
        switch (car) {
            case "i10":
            case "i20":
            case "verna":
                brand = "Hyundai";
                break;
            case "alto":
            case "swift":
            case "baleno":
                brand = "Maruti";
                break;
            default:
                brand = "car";
                break;

        }
        return brand;
    }

    private String newSwitch(String car){
        return switch (car){
            case "i10", "i20","verna" -> "Hyundai";
            case "alto","swift","baleno" -> "Maruti";
            default -> "car";
        };

    }
}
