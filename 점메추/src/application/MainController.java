package application;

import java.time.OffsetTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public class MainController {

    @FXML
    private Button button;

    @FXML
    private ImageView img;

    @FXML
    private Label menu;
    
    // 메뉴 리스트
    private static List<Menu> MENU_LIST;
    
    // 0.05초마다 동작하는 타임라인 객체
    private Timeline timeline = null;
    // 3초 뒤에 중지시키는 타임라인 객체
    private Timeline stop = null;
    
    
    /**
     * FXML 이 로딩될 때 초기화하는 메소드
     * * 데이터 초기화
     * * 이벤트 등록
     * @return
     */
    @FXML
    private void initialize() {
    	// 데이터 초기화
    	setData();
    	// 타이머 세팅
    	setTimer();
    	
    }
    
    /**
     * 애니메이션을 위한 타임라인 객체 생성
     */
    void setTimer() {
    	// 에니메이션 적용
    	// Timeline - 주기적으로 처리할 수 있도록 하는 애니메이션 클래스
    	timeline = new Timeline(
    			// KeyFrame( 시간, 이벤트 )
    			// : 지정한 시간마다 익명함수 호출
    			// * Duration.millis(밀리초) = 0.05ch
    			new KeyFrame( Duration.millis(50), e -> {
    				setMenu(); // 랜덤 메뉴 세팅
    			})
    			);
    	// 애니메이션 반복 횟수 설정 - Timeline.INDEFINITE (무한반복)
    	timeline.setCycleCount(Timeline.INDEFINITE);
    	
    	// 3초 뒤에 애니메이션 멈춤
    	stop = new Timeline(
    			// 3초마다 동작하는 애니메이션 지정
    			new KeyFrame( Duration.millis(3000), e -> timeline.stop() )
    			);
    	// 애니메이션 반복횟수 설정 - 1번 반복
    	stop.setCycleCount(1);
    }
    
    void setData() {
    	MENU_LIST = new ArrayList<Menu>();
    	List<String> nameList = Arrays.asList("안심스테이크", "비빔밥", "부대찌게", "불고기덮밥", "돼지국밥", "돈부리",
    			"돈까스", "갈비탕", "광어회", "잡체밥", "제육덮밥", "삼선짬뽕", "라멘", "김치찌게", "오징어덮밥",
    			"피자", "뼈해장국",	"삼겹살", "쌀국수", "파스타");
    	List<String> imgList
    	= Arrays.asList("ansimstake.jpg", "bibimbap.jpg", "boodejjigae.jpg", "bulgogidupbab.jpg", "daejigukbab.jpg",
    			"donburi.jpg", "donkachu.jpg", "galbitang.jpg", "gwangohwe.jpg", "japchaebap.jpg", "jeyookdupbab.jpg",
    			"jjampong.jpg", "jramen.jpg", "kimchijjigae.jpg", "ojingodupbab.jpg", "pizza.jpg", "ppyohaejanggook.jpg",
    			"samgyupsal.jpg", "ssalguksu.jpg", "tomatopasta.jpg");
    	for (int i = 0; i < 20; i++) {
    		String name = nameList.get(i);
    		String img = imgList.get(i);
    		MENU_LIST.add( new Menu(name, img ));
			
    		}
    }
    /**
     * 버튼 클릭 이벤트
     * @param event
     */
    @FXML
    void random(ActionEvent event) {
    	System.out.println("추천!!");
    	
    			// 에니메이션 중지
    			timeline.stop();
    			stop.stop();
    			
    			// 애니메이션 시작
    			timeline.play();
    			stop.play();

    }

    
    @FXML
    void setMenu() {
    	// TODO: 20개의 메뉴 요소들 중, 랜덤으로 하나 선택

    	
    	Random random = new Random();
    	int index = random.nextInt(20);
    	Menu randomMenu = MENU_LIST.get(index);
    	String menuName = randomMenu.getName();
    	String menuImg = randomMenu.getImg();
    	// 
    	menu.setText( menuName );
    	//랜덤 메뉴 이미지 지정
    	String filePath = getClass().getResource("/img/" + menuImg).toExternalForm();
    	img.setImage(new Image(filePath));
     			

    }

}
