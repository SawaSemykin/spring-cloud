CREATE TABLE RESERVATION (
  RESERVATION_ID     BIGINT AUTO_INCREMENT PRIMARY KEY,
  ROOM_ID    BIGINT,
  GUEST_ID     BIGINT,
  RES_DATE DATE
);