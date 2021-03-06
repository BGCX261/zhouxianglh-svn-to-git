package com.henglu.summer.bo;

/**
 * 客服接口消息,暂时只支持文字消息
 */
public class ServerMessageBO extends BaseBO {
	public class TextBO {
		private static final long serialVersionUID = -4642481430752575054L;
		private String content;

		public String getContent() {
			return content;
		}

		public void setContent(String content) {
			this.content = content;
		}
	}

	private static final long serialVersionUID = 7467680886565778201L;
	public static final String MSG_TYPE_TEXT = "text";
	private String touser;
	private String msgtype;

	private TextBO text;

	public TextBO getText() {
		return text;
	}

	public void setText(TextBO text) {
		this.text = text;
	}

	public String getMsgtype() {
		return msgtype;
	}

	public String getTouser() {
		return touser;
	}

	public void setMsgtype(String msgtype) {
		this.msgtype = msgtype;
	}

	public void setTouser(String touser) {
		this.touser = touser;
	}
}
