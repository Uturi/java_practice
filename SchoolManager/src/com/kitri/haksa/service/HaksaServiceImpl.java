package com.kitri.haksa.service;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import com.kitri.haksa.data.HaksaDto;

public class HaksaServiceImpl implements HaksaService {
	List<HaksaDto> list = new ArrayList<HaksaDto>();
	String job[] = {"학 번","과 목","부 서"};

	BufferedReader in = null;

	public HaksaServiceImpl() {
		in = new BufferedReader(new InputStreamReader(System.in));

	}

	@Override
	public void menu() { // 메인메뉴
		System.out.println("========== 메뉴 선택 ==========");
		System.out.println("1. 등록 \n2. 찾기 \n3. 삭제 \n4. 전체 출력");
		System.out.println("--------------------");
		System.out.println("0. 종료");
		System.out.println("--------------------");
		System.out.print("번호를 선택해 주세요..");
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
				System.out.println("잘못된 번호입니다.");
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
	public void registerMenu() {// 등록할 학사정보 입력받음
		System.out.println("========== 메뉴 선택 ==========");
		System.out.println("1. 학생 \n2. 교수 \n3. 관리자 \n4. 이전메뉴");
		System.out.print("번호를 선택해 주세요..");
		try {
//			in = new BufferedReader(new InputStreamReader(System.in));
			int key = Integer.parseInt(in.readLine().trim())-1;
			int age;
			String name;
			String value;

			switch (key) {
			case 0:
//				in = new BufferedReader(new InputStreamReader(System.in));
				System.out.print("나 이 : ");
				age = Integer.parseInt(in.readLine().trim());
//				in = new BufferedReader(new InputStreamReader(System.in));
				System.out.print("이 름 : ");
				name = in.readLine().trim();
//				in = new BufferedReader(new InputStreamReader(System.in));
				System.out.print("학 번 : ");
				value = in.readLine().trim();
				register(new HaksaDto(age, name, key, value));
				registerMenu();
				break;
			case 1:

				System.out.print("나 이 : ");
				age = Integer.parseInt(in.readLine());

				System.out.print("이 름 : ");
				name = in.readLine();

				System.out.print("과 목 : ");
				value = in.readLine();
				register(new HaksaDto(age, name, key, value));
				registerMenu();
				break;
			case 2:

				System.out.print("나 이 : ");
				age = Integer.parseInt(in.readLine());

				System.out.print("이 름 : ");
				name = in.readLine();

				System.out.print("부 서 : ");
				value = in.readLine();
				register(new HaksaDto(age, name, key, value));
				registerMenu();
				break;
			case 3:
				menu();
				break;
			default:
				System.out.println("잘못된 번호입니다.");
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
	public void register(HaksaDto haksaDto) {// 입력받은거 어레이리스트에 추가
		list.add(haksaDto);
		System.out.println("등록이 완료 되었습니다.");
	}

	@Override
	public void findNameMenu() {// 이름 입력 받아서 검색
		try {
			System.out.println("찾을 이름을 입력해주세요.");
			System.out.print("이 름 : ");
			String name = in.readLine().trim();
			HaksaDto search = findName(name);

			if (search != null) {
				System.out.println("이 름 : "+search.getName()+"\t나 이 : "+search.getAge()+"\t"+job[search.getKey()]+" : "+search.getValue());
			} else {
				System.out.println(name+"님을 찾을 수 없습니다.");
			}
			System.out.println("계속 하시려면 1, 종료 하시려면 0을 입력해 주세요. ");
			int c = Integer.parseInt(in.readLine());
			if (c == 1) {
				findNameMenu();
			} else if (c == 0) {
				menu();
			} else
				System.out.println("잘못된 번호입니다. 프로그램을 종료합니다.");
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
	public HaksaDto findName(String name) {// 실제검색해서 화면에 뿌리는 메소드
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
	public void deleteMenu() {// 삭제할 이름 입력받기
		try {
			System.out.println("삭제할 이름을 입력해주세요.");
			System.out.print("이 름 : ");
			String name;
			name = in.readLine().trim();
			int res = delete(name);
			if (res == 1) {
				System.out.println(name + "님이 삭제 되었습니다.");
			} else {
				System.out.println("삭제할 데이터가 없습니다.");
			}
			System.out.println("계속 하시려면 1, 종료 하시려면 0을 입력해 주세요. ");
			int c = Integer.parseInt(in.readLine());
			if (c == 1) {
				deleteMenu();
			} else if (c == 0) {
				menu();
			} else
				System.out.println("잘못된 번호입니다. 프로그램을 종료합니다.");
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
	public int delete(String name) {// 입력받은 이름으로 삭제하기
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
	public void selectAll() { // 등록되있는 모든 정보 다 뿌리기
		try {
			int size = list.size();
			for (int i = 0; i < size; i++) {
				HaksaDto allsel = list.get(i);
				System.out.println("이 름 : "+allsel.getAge()+"\t나 이 : "+allsel.getName()+"\t"+job[allsel.getKey()]+" : "+allsel.getValue());
			}
			
			System.out.println("계속 하시려면 1, 종료 하시려면 0을 입력해 주세요. ");
			int c;
			c = Integer.parseInt(in.readLine());
			if (c == 1) {
				selectAll();
			} else if (c == 0) {
				menu();
			} else
				System.out.println("잘못된 번호입니다. 프로그램을 종료합니다.");
			processExit();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void processExit() {
		System.out.println("프로그램을 종료합니다.");
		System.exit(0);
	}

}// 클래스 끝
