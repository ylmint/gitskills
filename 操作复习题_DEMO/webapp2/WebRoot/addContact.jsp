<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<HTML>
	<HEAD>
		<TITLE></TITLE>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

		<link href="style/mycss.css" rel="stylesheet" type="text/css" />
		<link href="style/texts.css" rel="stylesheet" type="text/css" />
		<link href="style/btn.css" rel="stylesheet" type="text/css" />

	</HEAD>
	<BODY BGCOLOR=#FFFFFF LEFTMARGIN=0 TOPMARGIN=0 MARGINWIDTH=0
		MARGINHEIGHT=0>

		<table width="780" border="0" align="center" cellpadding="0"
			cellspacing="0">
			<tr height="33">
				<td colspan="3">
					<br>
				</td>
			</tr>
			<tr>
				<td colspan="3">
					<img src="images/top.jpg" width="777" height="23">
				</td>
			</tr>
			<tr>
				<td width="19" background="images/middle2.jpg">
					&nbsp;
				</td>

				<td width="695">
					<table width="98%">
						<tr>
							<td width="3%">
								&nbsp;
							</td>
							<td width="97%">
								<form action="addContact.do" method="post" name="mf"
									onsubmit="return validateTitle()">
									<input type="hidden" name="affirm" value="n" />
									<table width="88%">
										<tr>
											<td colspan="2">
												ADD NEW CONTACT DETAILS
											</td>
										</tr>
										<tr>
											<td colspan="2">
												<hr />
											</td>
										</tr>
										<tr>
											<td>
												<strong>FIRST NAME：</strong>
											</td>
											<td>
												<input type="text" name="firstname">
											</td>
										</tr>
										<tr>
											<td>
												<strong>LAST NAME：</strong>
											</td>
											<td>
												<input type="text" name="FN">
											</td>
										</tr>
										<tr>
											<td>
												<strong>JOB TITLE：</strong>
											</td>
											<td>
												<input type="text" name="JT" />
											</td>
										</tr>
										<tr>
											<td>
												<strong>DEPARTMENT：</strong>
											</td>
											<td>
												<input type="text" name="DP" />
											</td>
										</tr>
										<tr>
											<td>
												<strong>PHONE：</strong>
											</td>
											<td>
												<input type="text" name="phone">
											</td>
										</tr>
										<tr>
											<td>
												<strong>MOBILE：</strong>
											</td>
											<td>
												<input type="text" name="ME">
											</td>
										</tr>
										<tr>
											<td>
												<strong>E-MAIL：</strong>
											</td>
											<td>
												<input type="text" name="email">
											</td>
										</tr>
										<tr>
											<td colspan="2">
												<div align="center">
													<input type="submit" value="SAVE" class="btn"> <input type="reset" value="RESET" class="btn">
												</div>
											</td>
										</tr>
									</table>
								</form>

							</td>
						</tr>

					</table>
				</td>
				<td width="40" background="images/middle4.jpg">
					&nbsp;
				</td>
			</tr>
			<tr>
				<td colspan="3">
					&nbsp;<img src="images/bottom.jpg" width="760" height="23">
				</td>
			</tr>
		</table>
		<P align="center">
			2010 XXX Information Technology Co.,Ltd 版权所有
		</P>
		<br />
	</BODY>
</HTML>