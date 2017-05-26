package com.designMode.Mediator.ex1;

public class Woman extends Person {

	public Woman(String name, int condition) {
		super(name, condition);
	}

	public void getPartner(Person person) {
		if(person instanceof Woman) {
			System.out.println("�����Ҳ���ͬ������");
		} else {
			if(this.getCondition() == person.getCondition()) {
				System.out.println(this.getName() + "��" + person.getName() + "����");
			} else {
				System.out.println(this.getName() + "��" + person.getName() + "������");
			}
		}
	}
	
}
