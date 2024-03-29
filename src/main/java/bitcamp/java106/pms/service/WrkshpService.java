// 서비스 컴포넌트 - 게시물 관련 업무를 처리할 객체
package bitcamp.java106.pms.service;

import java.util.List;

import bitcamp.java106.pms.domain.Wrkshp;

public interface WrkshpService {
    // 서비스 컴포넌트에서 메서드명을 지을 때는 
    // 업무 용어를 사용하라!
    List<Wrkshp> list(int no);
    List<Wrkshp> listtwo(int pageNo, int pageSize);
    Wrkshp get(int no);
    int add(Wrkshp wrkshp);
    int update(Wrkshp wrkshp);
    int delete(int no);
}

//ver 53 - 인터페이스 추가







