package com.kitri.haksa.service;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import com.kitri.haksa.data.HaksaDto;

public class HaksaServiceImpl implements HaksaService {
	List<HaksaDto> list = new ArrayList<HaksaDto>();
	String job[] = {"�� ��","�� ��","�� ��"};

	BufferedReader in = null;

	public HaksaServiceImpl() {
		in = new BufferedReader(new InputStreamReader(System.in));

	}

	@Override
	public void menu() { // ���θ޴�
		System.out.println("========== �޴� ���� ==========");
		System.out.println("1. ��� \n2. ã�� \n3. ���� \n4. ��ü ���");
		System.out.println("--------------------");
		System.out.println("0. ����");
		System.out.println("--------------------");
		System.out.print("��ȣ�� ������ �ּ���..");
		try {
			int mnum = Integer.parseInt(in.readLine().trim());

			switch (mnum) {
			case 0:
				processExit();
				break;
			case 1:
				registerMenu();
				break;
			case 2:
				findNameMenu();
				break;
			case 3:
				deleteMenu();
				break;
			case 4:
				selectAll();
				break;
			default:
				System.out.println("�߸��� ��ȣ�Դϴ�.");
				menu();
				break;
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void registerMenu() {// ����� �л����� �Է¹���
		System.out.println("========== �޴� ���� ==========");
		System.out.println("1. �л� \n2. ���� \n3. ������ \n4. �����޴�");
		System.out.print("��ȣ�� ������ �ּ���..");
		try {
//			in = new BufferedReader(new InputStreamReader(System.in));
			int key = Integer.parseInt(in.readLine().trim())-1;
			int age;
			String name;
			String value;

			switch (key) {
			case 0:
//				in = new BufferedReader(new InputStreamReader(System.in));
				System.out.print("�� �� : ");
				age = Integer.parseInt(in.readLine().trim());
//				in = new BufferedReader(new InputStreamReader(System.in));
				System.out.print("�� �� : ");
				name = in.readLine().trim();
//				in = new BufferedReader(new InputStreamReader(System.in));
				System.out.print("�� �� : ");
				value = in.readLine().trim();
				register(new HaksaDto(age, name, key, value));
				registerMenu();
				break;
			case 1:

				System.out.print("�� �� : ");
				age = Integer.parseInt(in.readLine());

				System.out.print("�� �� : ");
				name = in.readLine();

				System.out.print("�� �� : ");
				value = in.readLine();
				register(new HaksaDto(age, name, key, value));
				registerMenu();
				break;
			case 2:

				System.out.print("�� �� : ");
				age = Integer.parseInt(in.readLine());

				System.out.print("�� �� : ");
				name = in.readLine();

				System.out.print("�� �� : ");
				value = in.readLine();
				register(new HaksaDto(age, name, key, value));
				registerMenu();
				break;
			case 3:
				menu();
				break;
			default:
				System.out.println("�߸��� ��ȣ�Դϴ�.");
				registerMenu();
				break;
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void register(HaksaDto haksaDto) {// �Է¹����� ��̸���Ʈ�� �߰�
		list.add(haksaDto);
		System.out.println("����� �Ϸ� �Ǿ����ϴ�.");
	}

	@Override
	public void findNameMenu() {// �̸� �Է� �޾Ƽ� �˻�
		try {
			System.out.println("ã�� �̸��� �Է����ּ���.");
			System.out.print("�� �� : ");
			String name = in.readLine().trim();
			HaksaDto search = findName(name);

			if (search != null) {
				System.out.println("�� �� : "+search.getName()+"\t�� �� : "+search.getAge()+"\t"+job[search.getKey()]+" : "+search.getValue());
			} else {
				System.out.println(name+"���� ã�� �� �����ϴ�.");
			}
			System.out.println("��� �Ͻ÷��� 1, ���� �Ͻ÷��� 0�� �Է��� �ּ���. ");
			int c = Integer.parseInt(in.readLine());
			if (c == 1) {
				findNameMenu();
			} else if (c == 0) {
				menu();
			} else
				System.out.println("�߸��� ��ȣ�Դϴ�. ���α׷��� �����մϴ�.");
			processExit();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public HaksaDto findName(String name) {// �����˻��ؼ� ȭ�鿡 �Ѹ��� �޼ҵ�
		HaksaDto haksaDto = null;
		int size = list.size();
		for (int i = 0; i < size; i++) {
			HaksaDto dto = list.get(i);
			if (dto.getName().equals(name)) {
				haksaDto = dto;
				break;
			}
		}

		return haksaDto;

	}

	@Override
	public void deleteMenu() {// ������ �̸� �Է¹ޱ�
		try {
			System.out.println("������ �̸��� �Է����ּ���.");
			System.out.print("�� �� : ");
			String name;
			name = in.readLine().trim();
			int res = delete(name);
			if (res == 1) {
				System.out.println(name + "���� ���� �Ǿ����ϴ�.");
			} else {
				System.out.println("������ �����Ͱ� �����ϴ�.");
			}
			System.out.println("��� �Ͻ÷��� 1, ���� �Ͻ÷��� 0�� �Է��� �ּ���. ");
			int c = Integer.parseInt(in.readLine());
			if (c == 1) {
				deleteMenu();
			} else if (c == 0) {
				menu();
			} else
				System.out.println("�߸��� ��ȣ�Դϴ�. ���α׷��� �����մϴ�.");
			processExit();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	@Override
	public int delete(String name) {// �Է¹��� �̸����� �����ϱ�
		int size = list.size();
		for (int i = 0; i < size; i++) {
			HaksaDto dto = list.get(i);
			if (dto.getName().equals(name)) {
				list.remove(i);
				return 1;
			}
		}

		return 0;

	}

	@Override
	public void selectAll() { // ��ϵ��ִ� ��� ���� �� �Ѹ���
		try {
			int size = list.size();
			for (int i = 0; i < size; i++) {
				HaksaDto allsel = list.get(i);
				System.out.println("�� �� : "+allsel.getAge()+"\t�� �� : "+allsel.getName()+"\t"+job[allsel.getKey()]+" : "+allsel.getValue());
			}
			
			System.out.println("��� �Ͻ÷��� 1, ���� �Ͻ÷��� 0�� �Է��� �ּ���. ");
			int c;
			c = Integer.parseInt(in.readLine());
			if (c == 1) {
				selectAll();
			} else if (c == 0) {
				menu();
			} else
				System.out.println("�߸��� ��ȣ�Դϴ�. ���α׷��� �����մϴ�.");
			processExit();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void processExit() {
		System.out.println("���α׷��� �����մϴ�.");
		System.exit(0);
	}

}// Ŭ���� ��
